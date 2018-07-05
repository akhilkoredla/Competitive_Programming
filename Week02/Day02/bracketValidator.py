import unittest


def is_valid(code):
    mystack = []
    for char in code:
        if char == ')':
            if len(mystack)==0 or mystack.pop()!='(':
                return False
        elif char == '}':
            if len(mystack)==0 or mystack.pop()!='{':
                return False
        elif char == ']':
            if len(mystack)==0 or mystack.pop()!='[':
                return False
        elif char == '(' or char == '{' or char == '[':
            mystack.append(char)
    return len(mystack)==0

  


















# Tests

class Test(unittest.TestCase):

    def test_valid_short_code(self):
        result = is_valid('()')
        self.assertTrue(result)

    def test_valid_longer_code(self):
        result = is_valid('([]{[]})[]{{}()}')
        self.assertTrue(result)

    def test_mismatched_opener_and_closer(self):
        result = is_valid('([][]}')
        self.assertFalse(result)

    def test_missing_closer(self):
        result = is_valid('[[]()')
        self.assertFalse(result)

    def test_extra_closer(self):
        result = is_valid('[[]]())')
        self.assertFalse(result)

    def test_empty_string(self):
        result = is_valid('')
        self.assertTrue(result)


unittest.main(verbosity=2)
