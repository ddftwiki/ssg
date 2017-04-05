# ddft.wiki

Source code for ddft.wiki. We use a system called [Cryogen](https://cryogenweb.org) to generate the site. A quick overview is here.

## To build

```bash

lein run

```

## To test locally

```bash

lein ring server

```

## Configuration

The config file is at `resources/templates/config.edn1`. This controls some misc SSG stuff. You shouldn't need to modify this.

## Templates

You can find templates at `resources/templates/themes/ddftwiki/`. They use [Selmer](https://github.com/yogthos/Selmer) for a (a django/jinja/liquid/twig-style) templating system. Look at the examples and ask emidln if you have questions.

## Markdown

For basic syntax and a test console, see: https://rawgit.com/yogthos/markdown-clj/master/demo/markdown.html 

For our actual implementation, see: https://github.com/yogthos/markdown-clj.

## Pages

You can find pages at `resources/templates/md/pages/`. They are written in Markdown.

## Posts

You can find blog posts at `resources/templates/md/posts/`. They are written in Markdown.

