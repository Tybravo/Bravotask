import unittest

from task.chaptwo import sortascendingfloat

class TestSortAscendingFloat(unittest.TestCase):
    def test_sort_ascending_float_new_function(self):
        func = sortascendingfloat.ascending_float(1)
        self.assertIsNotNone(func, True)

    def test_sort_ascending_float_old_function(self):
        value = sortascendingfloat.ascending_float(73195)
        self.assertEqual(value, 13579)
