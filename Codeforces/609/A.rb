n = gets.to_i
m = gets.to_i
arr = []
for i in 0..n-1
    arr[i] = gets.to_i
end

arr = arr.sort
count = 0
idx = n-1
while m > 0
    m -= arr[idx]
    idx -= 1
    count += 1
end

puts count
