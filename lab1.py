class Numering:
    def __init__(self):
        print(self.numerate(self.inp('n'), self.inp('m'), self.inp('a'), self.inp('b')))

    def inp(self, text):
        try:
            question = int(input('Enter {}: '.format(text)))
        except Exception as e:
            self.inp(text)
        else:
            return question

    def numerate(self, n, m, a, b):
        сallback = 0
        C = 1129%3
        line = 'result = 0 '
        for i in range(n-a):
            for j in range(m-b):
                chislivnuk = (a-b)
                znamennuk = (a-C)
                if znamennuk == 0:
                    return "{} - {} give 0 in znamennuk, so we can't enumerate this".format(a, C)
                else:
                    сallback += (chislivnuk/znamennuk)
                    line += "+ {}/{} ".format(chislivnuk, znamennuk)
                    b += 1
            a += 1
        print (line)
        return сallback
if "__main__" == __name__:
    Numering()
