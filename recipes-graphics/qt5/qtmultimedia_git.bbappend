DEPENDS += "wayland"
#LDFLAGS_append += " -lwayland-client"
OE_QMAKE_CXXFLAGS += " -DEGL_PLATFORM_FBDEV "
