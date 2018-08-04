def exp_sum(n):
    list = [[0 for x in range(n+1)] for x in range(n+1)]
    return sume(n, 1, list)

def sume(n, index, list):
    if n == 0: return 1
    if n < 0: return 0
    if list[n][index] != 0:
        return list[n][index]
    count = 0
    for i in range(index, n+1):
        count += sume(n-i, i, list)
    list[n][index] = count
    return count
