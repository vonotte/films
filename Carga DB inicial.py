import requests

def postUsers(name):
	r = requests.post('http://localhost:8080/user/', json = {'name': name})
	print r.text.encode('utf-8')

def postFilms(title,year):
	r = requests.post('http://localhost:8080/film/', json = {'title': title,'year': year})
	print r.text


#postUsers('Otte')
#postUsers('Borrego')
#postUsers('Borrego2')
postUsers('xskxj')


#postFilms('Django','2012')