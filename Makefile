clean:
	lein clean
	rm -rf ddftwiki.bitbucket.io/*
build:
	lein run
install: build
	cp -r resources/public/* ddftwiki.bitbucket.io/
deploy: install
	cd ddftwiki.bitbucket.io && git add -A && git commit -m "deploying" && git push -u origin master -f 
view:
	lein ring server
all: clean deploy
