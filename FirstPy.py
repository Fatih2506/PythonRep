import pyautogui, time, calendar
print('what do you want to send e.g. hello world')
aqua = (input())
print('Ready')
time.sleep(2)
print('Get Set')
time.sleep(2)
print('GO!!')
time.sleep(1)

while True:
    ts = calendar.timegm(time.gmtime())
    time1 = time.ctime(ts)
    print(aqua, 'sent at', time1 )
    print('')
    pyautogui.typewrite(aqua)
    pyautogui.press("enter")