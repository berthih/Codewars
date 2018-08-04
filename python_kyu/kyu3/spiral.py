#this code work for the Make a piral kyu3 exercise on codewars.com

def spiralize(n):
    res = Matrix = [[0 for x in range(n)] for y in range(n)]
    dx, dy = [0, 1, 0, -1], [1, 0, -1, 0]
    x, y, c = 0, -1, 1
    for i in range(n + n - 1):
        for j in range((n + n - i) // 2):
            x += dx[i % 4]
            y += dy[i % 4]
            count = 0
            if x > 0 or y > 0:
                if x > 0:
                    count += res[x-1][y] == 1
                if y > 0:
                    count += res[x][y-1] == 1
                if y > 0 and x > 0:
                    count += res[x-1][y-1] == 1
                if x > 0 and n - 1 > y:
                    count += res[x-1][y+1] == 1
                if y > 0 and n - 1 > x:
                    count += res[x+1][y-1] == 1
                if n - 1 > y and n - 1 > x:
                    count += res[x+1][y+1] == 1
                if n - 1 > x:
                    count += res[x+1][y] == 1
                if n - 1 > y:
                    count += res[x][y+1] == 1
            res[x][y] = (int)(count <= 2)

    return res
