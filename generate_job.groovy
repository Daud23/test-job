job('generated-job') {
  	
    scm {
        git('https://git:git@github.com/beerkeeper/python-ip-script', 'master')
    }
    triggers {
        scm('*/2 * * * *')
    }
    steps {
      	shell('''
pip install -r requirements.txt
python main.py 
		''')
    }
}
