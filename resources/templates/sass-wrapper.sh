#!/bin/bash

sass_args=()
for arg; do
	if [ "$arg" != "--update" ]; then
		sass_args+="$arg"
	fi
done

sass ${sass_args[*]}


