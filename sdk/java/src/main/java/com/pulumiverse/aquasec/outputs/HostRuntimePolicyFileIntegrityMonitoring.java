// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostRuntimePolicyFileIntegrityMonitoring {
    /**
     * @return List of paths to be excluded from being monitored.
     * 
     */
    private final @Nullable List<String> excludedPaths;
    /**
     * @return List of processes to be excluded from being monitored.
     * 
     */
    private final @Nullable List<String> excludedProcesses;
    /**
     * @return List of users to be excluded from being monitored.
     * 
     */
    private final @Nullable List<String> excludedUsers;
    /**
     * @return If true, add attributes operations will be monitored.
     * 
     */
    private final @Nullable Boolean monitorAttributes;
    /**
     * @return If true, create operations will be monitored.
     * 
     */
    private final @Nullable Boolean monitorCreate;
    /**
     * @return If true, deletion operations will be monitored.
     * 
     */
    private final @Nullable Boolean monitorDelete;
    /**
     * @return If true, modification operations will be monitored.
     * 
     */
    private final @Nullable Boolean monitorModify;
    /**
     * @return If true, read operations will be monitored.
     * 
     */
    private final @Nullable Boolean monitorRead;
    /**
     * @return List of paths to be monitored.
     * 
     */
    private final @Nullable List<String> monitoredPaths;
    /**
     * @return List of processes to be monitored.
     * 
     */
    private final @Nullable List<String> monitoredProcesses;
    /**
     * @return List of users to be monitored.
     * 
     */
    private final @Nullable List<String> monitoredUsers;

    @CustomType.Constructor
    private HostRuntimePolicyFileIntegrityMonitoring(
        @CustomType.Parameter("excludedPaths") @Nullable List<String> excludedPaths,
        @CustomType.Parameter("excludedProcesses") @Nullable List<String> excludedProcesses,
        @CustomType.Parameter("excludedUsers") @Nullable List<String> excludedUsers,
        @CustomType.Parameter("monitorAttributes") @Nullable Boolean monitorAttributes,
        @CustomType.Parameter("monitorCreate") @Nullable Boolean monitorCreate,
        @CustomType.Parameter("monitorDelete") @Nullable Boolean monitorDelete,
        @CustomType.Parameter("monitorModify") @Nullable Boolean monitorModify,
        @CustomType.Parameter("monitorRead") @Nullable Boolean monitorRead,
        @CustomType.Parameter("monitoredPaths") @Nullable List<String> monitoredPaths,
        @CustomType.Parameter("monitoredProcesses") @Nullable List<String> monitoredProcesses,
        @CustomType.Parameter("monitoredUsers") @Nullable List<String> monitoredUsers) {
        this.excludedPaths = excludedPaths;
        this.excludedProcesses = excludedProcesses;
        this.excludedUsers = excludedUsers;
        this.monitorAttributes = monitorAttributes;
        this.monitorCreate = monitorCreate;
        this.monitorDelete = monitorDelete;
        this.monitorModify = monitorModify;
        this.monitorRead = monitorRead;
        this.monitoredPaths = monitoredPaths;
        this.monitoredProcesses = monitoredProcesses;
        this.monitoredUsers = monitoredUsers;
    }

    /**
     * @return List of paths to be excluded from being monitored.
     * 
     */
    public List<String> excludedPaths() {
        return this.excludedPaths == null ? List.of() : this.excludedPaths;
    }
    /**
     * @return List of processes to be excluded from being monitored.
     * 
     */
    public List<String> excludedProcesses() {
        return this.excludedProcesses == null ? List.of() : this.excludedProcesses;
    }
    /**
     * @return List of users to be excluded from being monitored.
     * 
     */
    public List<String> excludedUsers() {
        return this.excludedUsers == null ? List.of() : this.excludedUsers;
    }
    /**
     * @return If true, add attributes operations will be monitored.
     * 
     */
    public Optional<Boolean> monitorAttributes() {
        return Optional.ofNullable(this.monitorAttributes);
    }
    /**
     * @return If true, create operations will be monitored.
     * 
     */
    public Optional<Boolean> monitorCreate() {
        return Optional.ofNullable(this.monitorCreate);
    }
    /**
     * @return If true, deletion operations will be monitored.
     * 
     */
    public Optional<Boolean> monitorDelete() {
        return Optional.ofNullable(this.monitorDelete);
    }
    /**
     * @return If true, modification operations will be monitored.
     * 
     */
    public Optional<Boolean> monitorModify() {
        return Optional.ofNullable(this.monitorModify);
    }
    /**
     * @return If true, read operations will be monitored.
     * 
     */
    public Optional<Boolean> monitorRead() {
        return Optional.ofNullable(this.monitorRead);
    }
    /**
     * @return List of paths to be monitored.
     * 
     */
    public List<String> monitoredPaths() {
        return this.monitoredPaths == null ? List.of() : this.monitoredPaths;
    }
    /**
     * @return List of processes to be monitored.
     * 
     */
    public List<String> monitoredProcesses() {
        return this.monitoredProcesses == null ? List.of() : this.monitoredProcesses;
    }
    /**
     * @return List of users to be monitored.
     * 
     */
    public List<String> monitoredUsers() {
        return this.monitoredUsers == null ? List.of() : this.monitoredUsers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostRuntimePolicyFileIntegrityMonitoring defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedPaths;
        private @Nullable List<String> excludedProcesses;
        private @Nullable List<String> excludedUsers;
        private @Nullable Boolean monitorAttributes;
        private @Nullable Boolean monitorCreate;
        private @Nullable Boolean monitorDelete;
        private @Nullable Boolean monitorModify;
        private @Nullable Boolean monitorRead;
        private @Nullable List<String> monitoredPaths;
        private @Nullable List<String> monitoredProcesses;
        private @Nullable List<String> monitoredUsers;

        public Builder() {
    	      // Empty
        }

        public Builder(HostRuntimePolicyFileIntegrityMonitoring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedPaths = defaults.excludedPaths;
    	      this.excludedProcesses = defaults.excludedProcesses;
    	      this.excludedUsers = defaults.excludedUsers;
    	      this.monitorAttributes = defaults.monitorAttributes;
    	      this.monitorCreate = defaults.monitorCreate;
    	      this.monitorDelete = defaults.monitorDelete;
    	      this.monitorModify = defaults.monitorModify;
    	      this.monitorRead = defaults.monitorRead;
    	      this.monitoredPaths = defaults.monitoredPaths;
    	      this.monitoredProcesses = defaults.monitoredProcesses;
    	      this.monitoredUsers = defaults.monitoredUsers;
        }

        public Builder excludedPaths(@Nullable List<String> excludedPaths) {
            this.excludedPaths = excludedPaths;
            return this;
        }
        public Builder excludedPaths(String... excludedPaths) {
            return excludedPaths(List.of(excludedPaths));
        }
        public Builder excludedProcesses(@Nullable List<String> excludedProcesses) {
            this.excludedProcesses = excludedProcesses;
            return this;
        }
        public Builder excludedProcesses(String... excludedProcesses) {
            return excludedProcesses(List.of(excludedProcesses));
        }
        public Builder excludedUsers(@Nullable List<String> excludedUsers) {
            this.excludedUsers = excludedUsers;
            return this;
        }
        public Builder excludedUsers(String... excludedUsers) {
            return excludedUsers(List.of(excludedUsers));
        }
        public Builder monitorAttributes(@Nullable Boolean monitorAttributes) {
            this.monitorAttributes = monitorAttributes;
            return this;
        }
        public Builder monitorCreate(@Nullable Boolean monitorCreate) {
            this.monitorCreate = monitorCreate;
            return this;
        }
        public Builder monitorDelete(@Nullable Boolean monitorDelete) {
            this.monitorDelete = monitorDelete;
            return this;
        }
        public Builder monitorModify(@Nullable Boolean monitorModify) {
            this.monitorModify = monitorModify;
            return this;
        }
        public Builder monitorRead(@Nullable Boolean monitorRead) {
            this.monitorRead = monitorRead;
            return this;
        }
        public Builder monitoredPaths(@Nullable List<String> monitoredPaths) {
            this.monitoredPaths = monitoredPaths;
            return this;
        }
        public Builder monitoredPaths(String... monitoredPaths) {
            return monitoredPaths(List.of(monitoredPaths));
        }
        public Builder monitoredProcesses(@Nullable List<String> monitoredProcesses) {
            this.monitoredProcesses = monitoredProcesses;
            return this;
        }
        public Builder monitoredProcesses(String... monitoredProcesses) {
            return monitoredProcesses(List.of(monitoredProcesses));
        }
        public Builder monitoredUsers(@Nullable List<String> monitoredUsers) {
            this.monitoredUsers = monitoredUsers;
            return this;
        }
        public Builder monitoredUsers(String... monitoredUsers) {
            return monitoredUsers(List.of(monitoredUsers));
        }        public HostRuntimePolicyFileIntegrityMonitoring build() {
            return new HostRuntimePolicyFileIntegrityMonitoring(excludedPaths, excludedProcesses, excludedUsers, monitorAttributes, monitorCreate, monitorDelete, monitorModify, monitorRead, monitoredPaths, monitoredProcesses, monitoredUsers);
        }
    }
}
