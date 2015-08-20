#
# ============================================================================
# COMCAST C O N F I D E N T I A L AND PROPRIETARY
# ============================================================================
# This file and its contents are the intellectual property of Comcast.  It may
# not be used, copied, distributed or otherwise  disclosed in whole or in part
# without the express written permission of Comcast.
# ============================================================================
# Copyright (c) 2014 Comcast. All rights reserved.
# ============================================================================
#
SUMMARY = "Custom package group for RDK bits"

LICENSE = "CLOSED"

inherit packagegroup

PACKAGES = "\
    packagegroup-rdk-wayland \
    "

# Opensource components used in RDK
RDEPENDS_packagegroup-rdk-wayland = "\
    gpulib-hi3716cv200 \
    wayland \
    weston \
    qtwayland \
    "

#wayland-egl\
