import requests

def postUsers(name):
	r = requests.post('http://localhost:8080/user/', json = {'name': name})
	print r.text

def postFilms(title,year):
	r = requests.post('http://localhost:8080/film/', json = {'title': title,'year': year})
	print r.text

postUsers('Otte')
postUsers('Borrego')
postUsers('Borrego2')


postFilms('Django','2012')