def permutations(string):
    print string
    if (len(string) > 10):
        return ""
    if len(string) == 0:
        return ['']
    prevList = permutations(string[1:len(string)])
    nextList = []
    for i in range(0,len(prevList)):
        for j in range(0,len(string)):
            newString = prevList[i][0:j]+string[0]+prevList[i][j:len(string)-1]
            if newString not in nextList:
                nextList.append(newString)
    return nextList
