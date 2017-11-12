.PHONY: clean build install deploy view
clean:
	lein clean
	rm -rf ddftwiki.github.io/*
build:
	lein run
install: build
	cp -r resources/public/* ddftwiki.github.io/
deploy: clean install
	cd ddftwiki.github.io && git checkout master && git add -A && git commit --alow-empty -m "deploying" && git push -u origin master -f 
view:
	lein ring server
all: deploy
