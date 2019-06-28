import datetime, calendar

now = datetime.datetime.now()
print "Bulan ke-{} pada tahun {} adalah".format(now.month, now.year)

calendar.prmonth(now.year, now.month, 5, 1)
