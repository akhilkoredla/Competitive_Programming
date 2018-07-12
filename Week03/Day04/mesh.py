import unittest


def bfs_get_path(graph, start_node, end_node):
    # Find the shortest route in the network between the two users
    st = graph.setdefault(start_node, None)
    ed = graph.setdefault(end_node, None)
    if(st == None or ed == None):
        raise Exception
    visited = []
    parent = {}
    queue = []
    flag = False
    queue.append(start_node)
    while(len(queue)>0 and flag == False):
        node = queue.pop(0)
        if(node not in visited):
            visited.append(node)
            temp = graph[node]
            for x in temp:
                if (x!=end_node and x not in visited):
                    parent[x]=node
                    queue.append(x)
                elif(x==end_node):
                    queue.append(x)
                    parent[x]=node
                    flag = True
                    break
    val = parent.setdefault(end_node,None)
    
    if (val == None):
        return None
    else:
        res = []
        current = end_node
        while(current != start_node):
            res.append(current)
            current = parent[current]
        res.append(current)
        res.reverse()
        return res
 



















# Tests

class Test(unittest.TestCase):

    def setUp(self):
        self.graph = {
            'a': ['b', 'c', 'd'],
            'b': ['a', 'd'],
            'c': ['a', 'e'],
            'd': ['a', 'b'],
            'e': ['c'],
            'f': ['g'],
            'g': ['f'],
        }

    def test_two_hop_path_1(self):
        actual = bfs_get_path(self.graph, 'a', 'e')
        expected = ['a', 'c', 'e']
        self.assertEqual(actual, expected)

    def test_two_hop_path_2(self):
        actual = bfs_get_path(self.graph, 'd', 'c')
        expected = ['d', 'a', 'c']
        self.assertEqual(actual, expected)

    def test_one_hop_path_1(self):
        actual = bfs_get_path(self.graph, 'a', 'c')
        expected = ['a', 'c']
        self.assertEqual(actual, expected)

    def test_one_hop_path_2(self):
        actual = bfs_get_path(self.graph, 'f', 'g')
        expected = ['f', 'g']
        self.assertEqual(actual, expected)

    def test_one_hop_path_3(self):
        actual = bfs_get_path(self.graph, 'g', 'f')
        expected = ['g', 'f']
        self.assertEqual(actual, expected)

    def test_zero_hop_path(self):
        actual = bfs_get_path(self.graph, 'a', 'a')
        expected = ['a']
        self.assertEqual(actual, expected)

    def test_no_path(self):
        actual = bfs_get_path(self.graph, 'a', 'f')
        expected = None
        self.assertEqual(actual, expected)

    def test_start_node_not_present(self):
        with self.assertRaises(Exception):
            bfs_get_path(self.graph, 'h', 'a')

    def test_end_node_not_present(self):
        with self.assertRaises(Exception):
            bfs_get_path(self.graph, 'a', 'h')


unittest.main(verbosity=2)
