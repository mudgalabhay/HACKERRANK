def solver(year):
    if (year == 1918):
        print('26.09.1918')
    elif ((year <= 1917) & (year%4 == 0)) or ((year%400 == 0) or ((year%4 ==0) & (year%100 != 0))):
        print('12.09.%s' %year)
    else:
        print('13.09.%s' %year)

year = int(input())
solver(year)

