clean:
	lein clean
	rm -rf public/*
build:
	lein run
install: build
	mkdir -p public
	cp -r resources/public/* public/
deploy: install
	cd public
	git add -A
	git commit -m "deploying"
	git push -u origin master
	cd ..
view:
	lein ring server
all: clean install
