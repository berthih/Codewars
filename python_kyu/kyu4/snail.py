def snail(array):
    n = len(array[0])
    res = []
    dx, dy = [0, 1, 0, -1], [1, 0, -1, 0]
    x, y = 0, -1
    for i in range(n + n - 1):
        for j in range((n + n - i) // 2):
            x += dx[i % 4]
            y += dy[i % 4]
            res.append(array[x][y])
    return res
