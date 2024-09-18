import unittest

from task.chaptwo import sepdigits

class TestSepDigits(unittest.TestCase):
    def test_sep_digits_function_exist(self):
        exists = sepdigits.sep_digits(42339)
        self.assertIsNotNone(exists)

    def test_sep_digits_are_separated_with_spaces(self):
        separated = sepdigits.sep_digits(42339)
        self.assertEqual(separated," 4 2 3 3 9  ")
