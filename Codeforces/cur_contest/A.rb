n, s = gets.split.map(&:to_i)
min_time = s
(1..n).each do
  floor, time = gets.split.map(&:to_i)
  min_time = [floor+time, min_time].max
end
puts min_time
