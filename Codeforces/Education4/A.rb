n, p, q = gets.split.map(&:to_i)
s = gets.chomp

a = b = -1
for i in 0..100
  for j in 0..100
    if p*i + q*j == n
      a = i
      b = j
    end
  end
end

if a == -1
  puts a
  exit
end

puts a+b

idx = 0
(1..a).each do
  puts s[idx, p]
  idx += p
end

(1..b).each do
  puts s[idx, q]
  idx += q
end
