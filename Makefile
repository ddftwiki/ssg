.PHONY: clean build install deploy view
clean:
	lein clean
	rm -rf ddftwiki.bitbucket.io/*
build:
	lein run
install: build
	cp -r resources/public/* ddftwiki.bitbucket.io/
deploy: clean install
	cd ddftwiki.bitbucket.io && git checkout master && git add -A && git commit -m "deploying" && git push -u origin master -f 
view:
	lein ring server
all: deploy
