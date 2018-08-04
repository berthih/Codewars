def loop_size(node):
    nodes = []
    i = 0
    while True:
        nodes.append(node)
        i += 1
        node = node.next
        if i > 15000:
            return i
        if node in nodes:
            print i
            return i - [j for j,x in enumerate(nodes) if x == node][0]
    pass
