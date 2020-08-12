#!/bin/bash

for i in 1 2 4 8 16
do
	j=$((16/i))
	for k in 1 2
	do
		if [ $i -eq 1 ];then
			if [ $k -eq 2 ];then
				continue
			fi
		fi
		make verilog CONFIG=PhantomTinyBoomConfigS${i}W${j}R$k
	done
done
