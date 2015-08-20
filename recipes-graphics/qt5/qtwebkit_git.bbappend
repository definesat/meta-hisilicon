FILESEXTRAPATHS_prepend := "${THISDIR}/qtwebkit:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PACKAGES += "${PN}-examples"

DEPENDS += "wayland"
#LDFLAGS_append += " -lwayland-client"
OE_QMAKE_CXXFLAGS += " -DEGL_PLATFORM_FBDEV "

