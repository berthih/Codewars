from itertools import product
DIGITS = set(range(1, 10))
THREES = [(0, 1, 2), (3, 4, 5), (6, 7, 8)]

def correct(groups):
    return all(set(group) == DIGITS for group in groups)
    
def validSolution(grid):
    assert isinstance(grid, list)

    if len(grid) != 9 or not all(len(row) == 9 for row in grid):
        return None

    rows = grid
    columns = zip(*grid)
    squares3x3 = [
        [grid[r][c] for r, c in product(row_block, col_block)]
        for row_block, col_block in product(THREES, THREES)
    ]

    return correct(rows) and correct(columns) and correct(squares3x3)
