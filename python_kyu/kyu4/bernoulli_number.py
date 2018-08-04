from fractions import Fraction as Fr
def bernoulli_number(n):
    if (n>1 and n % 2 != 0):
        return 0
    bn2 = [ix for ix in zip(range(n+1), bernoulli2())]
    bn2 = [(i, b) for i,b in bn2 if b]
    print bn2, n
    if (n == 1):
        return -(bn2[n][1])
    if (n == 2):
        return bn2[n][1]
    if (n == 0):
        return 1
    if (bn2):
        return bn2[n/2 + 1][1]
    
def bernoulli2():
    A, m = [], 0
    while True:
        A.append(Fr(1, m+1))
        for j in range(m, 0, -1):
          A[j-1] = j*(A[j-1] - A[j])
        yield A[0]
        m += 1
        
