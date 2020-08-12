#!/bin/bash
for i in 1 2 4 16
do
	j=$((16/i))
	config=NormalTinyBoomConfigS${i}W${j}
	make verilog CONFIG=$config
	cp generated-src/example.TestHarness.$config/example*.v ../formal/sim/vsim
	cd ../formal/sim/
	sh patch.sh vsim/example*$config
	cd ../../vlsi
done

