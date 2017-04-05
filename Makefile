clean:
	lein clean
	rm -rf public
build:
	lein run
install: build
	cp resources/public/* public/
deploy: install
	git add public
	git commit -m "deploying"
	git push
view:
	lein ring server
all: clean install
