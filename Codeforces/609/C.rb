n = gets.to_i
servers = gets.split.map(&:to_i).sort.reverse
sum = servers.reduce(&:+)
min_load = sum/servers.length
extra = sum%servers.length
optimal = Array.new(n, min_load)
for i in 0...extra
  optimal[i] += 1
end
count = 0
for i in 0...n
  count += (servers[i]-optimal[i]).abs
end
puts count/2
