def solve(input)
  if (/R\d+C\d+/ =~ input) == nil
    fromBase26(input)
  else
    toBase26(input)
  end
end

def fromBase26(input)
  charByte = "A".bytes[0]
  numByte = "1".bytes[0]
  letters = Array.new
  numbers = Array.new

  input.chomp.each_byte do |byte|
    if byte < charByte
      numbers.unshift(byte-(numByte-1))
    else
      letters.unshift(byte-(charByte-1))
    end
  end

  rows = arrayToInt(numbers, 10)
  cols = arrayToInt(letters, 26)
  "R#{rows}C#{cols}"
end

def toBase26(input)
  input[0] = ""
  rows, cols = input.split("C")
  val = cols.to_i
  digits = []
  while val != 0
    digits.unshift((val-1)%26)
    val = (val-1)/26
  end
  cols = ""
  for digit in digits
    val = digit + ("A".bytes[0])
    cols += val.chr
  end
  cols + "#{rows}"
end

def arrayToInt(arr, base)
  curr = 1
  int = 0
  for val in arr
    int += val*curr
    curr *= base
  end
  int
end

n = gets.to_i
ans = Array.new(n, nil)
for i in (0...n)
  ans[i] = solve(gets)
end

for answer in ans
  puts answer
end
