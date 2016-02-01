def hamming_dist(a, b)
  sum = 0
  for i in 0...a.length
    sum += (a[i].to_i-b[i].to_i).abs
  end
  sum
end

a = gets.chomp
b = gets.chomp

cache = Hash.new
sum = 0
for i in 0..(b.length-a.length)
  sub = b[i, a.length]
  if cache[sub] == nil
    cache[sub] = hamming_dist(a, sub)
  end
  sum += cache[sub]
end
puts sum
