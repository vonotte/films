import requests

def postUsers(name):
	r = requests.post('http://localhost:8080/user/', json = {'name': name})
	print r.text.encode('utf-8')

def deleteUsers(id):
	r = requests.delete('http://localhost:8080/user/'+`id`)
	print r.text.encode('utf-8')

def postFilms(title,year):
	r = requests.post('http://localhost:8080/film/', json = {'title': title,'year': year})
	print r.text

def postEvaluation(id_user,id_film,points):
	r = requests.post('http://localhost:8080/evaluation/', json = {'id_user': id_user,'id_film': id_film, 'points': points})
	print r.text

def putEvaluation(id_user,id_film,points):
	r = requests.put('http://localhost:8080/evaluation/1', json = {'id_user': id_user,'id_film': id_film, 'points': points})
	print r.text
def deleteEvaliation(id):
	r = requests.delete('http://localhost:8080/evaluation/'+`id`)
	print r.text.encode('utf-8')

def postCategory(name):
	r = requests.post('http://localhost:8080/category/', json = {'name': name})
	print r.text.encode('utf-8')

postUsers('Otte')
postUsers('Borrego')
postUsers('Borrego2')
postUsers('Oriana')

postFilms('Django','2012')
postFilms('Matrix','1999')
postFilms('abc','2000')

postCategory('Accion')
postCategory('Drama')
postCategory('Comedia')



postEvaluation(2,2,5)
postEvaluation(1,1,5)
postEvaluation(1,2,8)
postEvaluation(1,3,8)
postEvaluation(2,1,10)



