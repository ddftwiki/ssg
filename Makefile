clean:
	lein clean
	rm -rf public/*
build:
	lein run
install: build
	mkdir -p public
	cp -r resources/public/* ddftwiki.bitbucket.io/
deploy: install
	cd public && git add -A && git commit -m "deploying" && git push -u origin master
	cd ddftwiki.bitbucket.io && git add -A && git commit -m "deploying" && git push -u origin master -f 
view:
	lein ring server
all: clean deploy
