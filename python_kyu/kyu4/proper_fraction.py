from itertools import count

def proper_fractions(n):
    if n == 1:
        return 0
    elif isPrime(n):
        return n - 1
    for i in range(2, int(n ** 0.5)):
        if not n % (i ** 2):
            return i * proper_fractions(n // i)
        elif not n % i:
            return (i - 1) * proper_fractions(n // i)
            
    counter = 1
    for i in range(2, n):
        if set(prime_factors(n)).isdisjoint(set(prime_factors(i))):
            counter += 1
    return counter

def nextPrime(n):
    for i in count(n + 1):
        if isPrime(i):
            return i

def isPrime(n):
    for i in (2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37):
        if i == n:
            return True
        elif not n % i:
            return False

    for i in range(27, int(n ** 0.5) + 1, 2):
        if not n % i:
            return False

    return True

def prime_factors(n):
    x = 2
    while n >= x:
        if not n % x:
            return prime_factors(n // x) + [x]
        x = nextPrime(x)

    return []
