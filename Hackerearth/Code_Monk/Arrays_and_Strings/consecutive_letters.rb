T = gets.to_i
S = []

for i in (0...T)
  S[i] = gets
end

for s in S
  ans = s[0]
  for i in 1...s.length
    if s[i-1] != s[i]
      ans << s[i]
    end
  end
  puts ans
end
