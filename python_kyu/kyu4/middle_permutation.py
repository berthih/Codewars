# this code work for middle permutation exercise kyu4 on codewars.com

import itertools

def middle_permutation(string):
    str_len = len(string)
    str_sorted = sorted(string)
    if str_len % 2 == 0:
        start = str_sorted.pop(str_len // 2 - 1)
        return start + ''.join(sorted(str_sorted, reverse=True))
    start = str_sorted.pop(str_len // 2)
    return start + middle_permutation(''.join(str_sorted))
