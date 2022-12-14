// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionRuntimePolicyScopeVariable {
    /**
     * @return Class of supported scope.
     * 
     */
    private String attribute;
    /**
     * @return Name assigned to the attribute.
     * 
     */
    private @Nullable String name;
    /**
     * @return Value assigned to the attribute.
     * 
     */
    private String value;

    private FunctionRuntimePolicyScopeVariable() {}
    /**
     * @return Class of supported scope.
     * 
     */
    public String attribute() {
        return this.attribute;
    }
    /**
     * @return Name assigned to the attribute.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Value assigned to the attribute.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionRuntimePolicyScopeVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attribute;
        private @Nullable String name;
        private String value;
        public Builder() {}
        public Builder(FunctionRuntimePolicyScopeVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public FunctionRuntimePolicyScopeVariable build() {
            final var o = new FunctionRuntimePolicyScopeVariable();
            o.attribute = attribute;
            o.name = name;
            o.value = value;
            return o;
        }
    }
}
