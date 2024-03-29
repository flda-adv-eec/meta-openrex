# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRC_URI = "git://github.com/flda-adv-eec/openrex-linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"
LOCALVERSION = "-fslc"

#PV .= "+git${SRCPV}"

SRCBRANCH = "jethro"
SRCREV = "fdaba4766b97485caf7cc8935bf31c92a4586d7a"

COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex)"
