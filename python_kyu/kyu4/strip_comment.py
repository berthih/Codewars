# this code wrok for strip comment exercise kyu4 on corewars.com

def solution(line, sep):
    lines = line.split('\n')
    for i, lin in enumerate(lines):
        for marker in sep:
            index = lin.find(marker)
            if index != -1:
                lin = lin[:index]
        lines[i] = lin.rstrip(' ')
    return '\n'.join(lines)
