import unittest
from task.chaptwo import howbigpythoninteger

class Test_HowBigPythonInteger(unittest.TestCase):
    def test_how_big_python_integer_function_exist(self):
        exists = howbigpythoninteger.big_integer_9_power_50(1,1)
        self.assertIsNotNone(exists,True)

    def test_how_big_python_integer_power_50(self):
        exists = howbigpythoninteger.big_integer_9_power_50(9,50)
        self.assertEqual(exists, 515377520732011331036461129765621272702107522001)

    def test_how_big_python_integer_power_100(self):
        exists = howbigpythoninteger.big_integer_9_power_50(9,100)
        self.assertEqual(exists, 265613988875874769338781322035779626829233452653394495974574961739092490901302182994384699044001)



