def num_ways(n, k)
  count = 1
  for i in 0...(n-k)
    count += 1
  end
  count
end

data = gets.split.map(&:to_i)
n = data[0]
t = data[1]
c = data[2]
arr = gets.split.map(&:to_i)
aarr = []
sub = []
for i in 0...n
  if arr[i] <= t
    sub << arr[i]
  else
    aarr << sub
    sub = []
  end
end

aarr << sub

count = 0
for arr in aarr do
  if arr.length < c
    next
  end
  count += num_ways(arr.length, c)
end

puts count
