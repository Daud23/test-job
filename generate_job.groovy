job('generated-job') {
  	
    scm {
        git('https://git:git@github.com/beerkeeper/python-ip-script', 'master')
    }
    steps {
      	shell('''
pip install -r requirements.txt
python main.py 
		''')
    }
}
