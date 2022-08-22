n = int(input())
nums = sorted([int(input()) for i in range(n)])

num_dic = {}
for num in nums :
    if num in num_dic.keys():
        num_dic[num] += 1
    else:
        num_dic[num] = 1

num_dic = sorted(num_dic.items(), key = lambda x: (-x[1], x[0]))
try:
    if num_dic[0][1] == num_dic[1][1]:
        mode_num = num_dic[1][0]
    else:
        mode_num = num_dic[0][0]
except:
    mode_num = nums[0]
print(round(sum(nums)/n))
print(nums[int(n/2)])
print(mode_num)
print(max(nums)-min(nums))
