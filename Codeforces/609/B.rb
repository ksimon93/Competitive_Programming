n, m = gets.split.map(&:to_i)
books = gets.split.map(&:to_i)
genre = Array.new(m)
for book in books
  if genre[book] == nil
    genre[book] = 1
  else
    genre[book] += 1
  end
end

count = 0
for i in (1..m-1)
  for j in (i+1..m)
    count += genre[i] * genre[j]
  end
end

puts count
