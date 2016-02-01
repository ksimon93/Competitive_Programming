# Given an array of numbers, each index representing a single digit, add one
# to the value and maintain the array format. 
# e.g. [5,2,2] == [5,2,3], 522+1 = 523

str_arr = gets.split
int_arr = str_arr.map(&:to_i)
p int_arr

cin = 1
len = int_arr.length
(len-1).downto(0) do |i|
    new = int_arr[i]+cin
    cin = new/10
    int_arr[i] = new%10 
end

if cin == 1
    int_arr.unshift(cin)
end

p int_arr
