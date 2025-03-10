package com.example.gio.bigproject.models.bus_stops;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

/**
 * Copyright by Gio.
 * Created on 4/19/2017.
 */

@Data
class Photos {
    @SerializedName("photo_reference")
    @Expose
    private String photoReference;
}
