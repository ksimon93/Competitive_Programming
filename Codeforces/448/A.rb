cups_str = gets.split
cups_int = cups_str.map(&:to_i)
cups_sum = cups_int.reduce(:+)

medals_str = gets.split
medals_int = medals_str.map(&:to_i)
medals_sum = medals_int.reduce(:+)

n = gets.to_i

n -= (cups_sum/5.0).ceil
n -= (medals_sum/10.0).ceil

if n >= 0
    puts "YES"
else
    puts "NO"
end
