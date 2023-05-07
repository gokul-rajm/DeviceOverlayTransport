package device.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "device_table")
public class DeviceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "device_id")
	private int deviceId;

	@Column
	private String mode;

	@Column(name = "min_bandwidth_up")
	private int minBandwidthUp;

	@Column(name = "bandwidth_up")
	private int bandwidthUp;

	@Column(name = "min_bandwidth_down")
	private int minBandwidthDown;

	@Column(name = "bandwidth_down")
	private int bandwidthDown;

	

	@Column(name = "interface_speed")
	private String interfaceSpeed;

	@Column(name = "default_bgp_local_preference")
	private int defaultBgpLocalPreference;

	@Enumerated(EnumType.ORDINAL)
	@Column
	private DeviceEnum dti;

	@Enumerated(EnumType.ORDINAL)
	@Column
	private DeviceEnum nat;

	@Column
	private int mtu;

	@Column(name = "public_ip_address")
	private String publicIpAddress;

	@Column(name = "access_router_ip_address")
	private String accessRouterIpAddress;
	
	@Enumerated(EnumType.ORDINAL)
	@Column
	private DeviceEnum dhcp;

	@Column(name = "overlay_ip_address")
	private String overlayIpAddress;

	@Column(name = "ip_address")
	private String ipAddress;

	@Column(name = "prefix_length")
	private String prefixLength;

	@Column(name = "default_gateway")
	private String defaultGateway;

//	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "transport_network")
//	private TransportNetwork transportNetwork;
//
//	@OneToMany(mappedBy = "device", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JsonIgnoreProperties({"device"})
//	private Set<Overlay> overlays;
	
	@Column(name = "transport_network_id")
	private int transportNetworkId;
	
	@Column(name = "overlay_id")
	private int overlayId;

	public DeviceEntity(int deviceId, String mode, int minBandwidthUp, int bandwidthUp, int minBandwidthDown,
			int bandwidthDown, String interfaceSpeed, int defaultBgpLocalPreference, DeviceEnum dti, DeviceEnum nat,
			int mtu, String publicIpAddress, String accessRouterIpAddress, DeviceEnum dhcp, String overlayIpAddress,
			String ipAddress, String prefixLength, String defaultGateway, int transportNetworkId, int overlayId) {
		super();
		this.deviceId = deviceId;
		this.mode = mode;
		this.minBandwidthUp = minBandwidthUp;
		this.bandwidthUp = bandwidthUp;
		this.minBandwidthDown = minBandwidthDown;
		this.bandwidthDown = bandwidthDown;
		this.interfaceSpeed = interfaceSpeed;
		this.defaultBgpLocalPreference = defaultBgpLocalPreference;
		this.dti = dti;
		this.nat = nat;
		this.mtu = mtu;
		this.publicIpAddress = publicIpAddress;
		this.accessRouterIpAddress = accessRouterIpAddress;
		this.dhcp = dhcp;
		this.overlayIpAddress = overlayIpAddress;
		this.ipAddress = ipAddress;
		this.prefixLength = prefixLength;
		this.defaultGateway = defaultGateway;
		this.transportNetworkId = transportNetworkId;
		this.overlayId = overlayId;
	}

	public DeviceEntity() {
		super();
	}

	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", mode=" + mode + ", minBandwidthUp=" + minBandwidthUp
				+ ", bandwidthUp=" + bandwidthUp + ", minBandwidthDown=" + minBandwidthDown + ", bandwidthDown="
				+ bandwidthDown + ", interfaceSpeed=" + interfaceSpeed + ", defaultBgpLocalPreference="
				+ defaultBgpLocalPreference + ", dti=" + dti + ", nat=" + nat + ", mtu=" + mtu + ", publicIpAddress="
				+ publicIpAddress + ", accessRouterIpAddress=" + accessRouterIpAddress + ", dhcp=" + dhcp
				+ ", overlayIpAddress=" + overlayIpAddress + ", ipAddress=" + ipAddress + ", prefixLength="
				+ prefixLength + ", defaultGateway=" + defaultGateway + ", transportNetworkId=" + transportNetworkId
				+ ", overlayId=" + overlayId + "]";
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getMinBandwidthUp() {
		return minBandwidthUp;
	}

	public void setMinBandwidthUp(int minBandwidthUp) {
		this.minBandwidthUp = minBandwidthUp;
	}

	public int getBandwidthUp() {
		return bandwidthUp;
	}

	public void setBandwidthUp(int bandwidthUp) {
		this.bandwidthUp = bandwidthUp;
	}

	public int getMinBandwidthDown() {
		return minBandwidthDown;
	}

	public void setMinBandwidthDown(int minBandwidthDown) {
		this.minBandwidthDown = minBandwidthDown;
	}

	public int getBandwidthDown() {
		return bandwidthDown;
	}

	public void setBandwidthDown(int bandwidthDown) {
		this.bandwidthDown = bandwidthDown;
	}

	public String getInterfaceSpeed() {
		return interfaceSpeed;
	}

	public void setInterfaceSpeed(String interfaceSpeed) {
		this.interfaceSpeed = interfaceSpeed;
	}

	public int getDefaultBgpLocalPreference() {
		return defaultBgpLocalPreference;
	}

	public void setDefaultBgpLocalPreference(int defaultBgpLocalPreference) {
		this.defaultBgpLocalPreference = defaultBgpLocalPreference;
	}

	public DeviceEnum getDti() {
		return dti;
	}

	public void setDti(DeviceEnum dti) {
		this.dti = dti;
	}

	public DeviceEnum getNat() {
		return nat;
	}

	public void setNat(DeviceEnum nat) {
		this.nat = nat;
	}

	public int getMtu() {
		return mtu;
	}

	public void setMtu(int mtu) {
		this.mtu = mtu;
	}

	public String getPublicIpAddress() {
		return publicIpAddress;
	}

	public void setPublicIpAddress(String publicIpAddress) {
		this.publicIpAddress = publicIpAddress;
	}

	public String getAccessRouterIpAddress() {
		return accessRouterIpAddress;
	}

	public void setAccessRouterIpAddress(String accessRouterIpAddress) {
		this.accessRouterIpAddress = accessRouterIpAddress;
	}

	public DeviceEnum getDhcp() {
		return dhcp;
	}

	public void setDhcp(DeviceEnum dhcp) {
		this.dhcp = dhcp;
	}

	public String getOverlayIpAddress() {
		return overlayIpAddress;
	}

	public void setOverlayIpAddress(String overlayIpAddress) {
		this.overlayIpAddress = overlayIpAddress;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getPrefixLength() {
		return prefixLength;
	}

	public void setPrefixLength(String prefixLength) {
		this.prefixLength = prefixLength;
	}

	public String getDefaultGateway() {
		return defaultGateway;
	}

	public void setDefaultGateway(String defaultGateway) {
		this.defaultGateway = defaultGateway;
	}

	public int getTransportNetworkId() {
		return transportNetworkId;
	}

	public void setTransportNetworkId(int transportNetworkId) {
		this.transportNetworkId = transportNetworkId;
	}

	public int getOverlayId() {
		return overlayId;
	}

	public void setOverlayId(int overlayId) {
		this.overlayId = overlayId;
	}


	
	
	
	
	

}
