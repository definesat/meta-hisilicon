DESCRIPTION = "hi3716cv200 user space libs for drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8860c6daecb5fe2cbc4eb4fc9d9b33f6"

PROVIDES = "virtual/driverlibs-rdk-hisilicon"

PV = "1.0+gitr${SRCPV}"

#SRCREV="ff0bb195973168623d2cced8500c39c4e2538ddb"
SRCREV="2edf9e392e26b3165db9297a92ada514e573fa30"
SRC_URI = "git://github.com/hisilicon/x5hd2-drivers.git;branch=wayland;protocol=https"

S = "${WORKDIR}/git"


do_compile() {
    oe_runmake -C source/common/api
    oe_runmake -C source/msp api
}


do_install() {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    export INCLUDE_DIR="${D}${includedir}"
    export STATIC_LIB_DIR="${D}${libdir}"
    export SHARED_LIB_DIR="${D}${libdir}"
    export EXTERN_LIB_DIR="${D}${libdir}"

    # common module
    oe_runmake -C source/common/api install

    # msp module
    oe_runmake -C source/msp api_install
}

FILES_${PN} = "${libdir}"
FILES_${PN}-dev = "${includedir}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
