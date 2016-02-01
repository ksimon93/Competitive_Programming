t = gets.to_i
answers = Array.new(t)
(1..t).each do |curr|
  n,x = gets.split.map(&:to_i)
  cost = Array.new(n)
  (0...n).each do |i|
    cost[i] = gets.to_i
  end

  head = tail = sum = 0
  while sum != x && tail < n
    if sum < x && head < n
      sum += cost[head]
      head += 1
    else
      sum -= cost[tail]
      tail += 1
    end
  end

  if sum == x
    answers[curr] = "YES"
  else
    answers[curr] = "NO"
  end
end

answers.each do |answer|
  puts answer
end
